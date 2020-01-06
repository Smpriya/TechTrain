//import config from 'config';
import { authHeader } from "../_helpers";
import axios from "axios";

export const userService = {
  login,
  logout,
  getAll
};

function login(username, password) {
  axios
    .get("https://wjnr4.sse.codesandbox.io/users?username=" + username)
    .then(response => {
      console.log("data=");
      console.log(response);
    });

  //console.log("requestOptions=");
  //console.log(requestOptions);

  //return fetch(
  // "https://wjnr4.sse.codesandbox.io/users?username=" + username,
  //requestOptions
  //)
  //.then(handleResponse)
  // .then(user => {
  // login successful if there's a user in the response
  //  if (user) {
  // store user details and basic auth credentials in local storage
  // to keep user logged in between page refreshes
  //   user.authdata = window.btoa(username + ":" + password);
  //  localStorage.setItem("user", JSON.stringify(user));
  //}

  //return user;
  //});
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

  return fetch(`http://localhost:4000/users`, requestOptions).then(
    handleResponse
  );
}

function handleResponse(response) {
  console.log("response=");
  console.log(response);
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
