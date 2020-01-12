//import config from 'config';
import { authHeader } from "../_helpers";

export const userService = {
  login,
  logout,
  getAll
};

const url = "http://localhost:4000/";

function login(username, password) {
  console.log("un====" + username);

  return fetch(url + "users?username=" + username, {
    headers: { "Content-Type": "application/json" }
  }).then(handleResponse)
    .then(user => {
      if (user) {
        user[0].authdata = window.btoa(username + ":" + password);
        console.log("==" + user.authdata);
        console.log("==" + JSON.stringify(user));
        //var a = JSON.parse(user);
        console.log("==||==" + user.length);
        console.log("==||==" + user[0].firstname);
        localStorage.setItem("user", JSON.stringify(user));
        console.log("Completed....1");
      }
      return user;
    });
}

function logout() {
  // remove user from local storage to log user out
  localStorage.removeItem("user");
}

function getAll() {
  const requestOptions = {
    method: "GET",
    headers: authHeader()
  };

  return fetch(url + "users", requestOptions).then(handleResponse);
}

function handleResponse(response) {
  return response.text().then(text => {
    const data = text && JSON.parse(text);
    if (!response.ok) {
      if (response.status === 401) {
        // auto logout if 401 response returned from api
        logout();
        window.location.reload(true);
      }

      const error = (data && data.message) || response.statusText;
      return Promise.reject(error);
    }

    return data;
  });
}
