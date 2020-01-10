import React from "react";
import { Link } from "react-router-dom";

import { userService } from "../_services";

class HomePage extends React.Component {
  constructor(props) {
    super(props);

    this.state = {
      user: {},
      users: []
    };
  }

  componentDidMount() {
    this.setState({
      //user: JSON.parse(localStorage.getItem("user")),
      user: localStorage.getItem("user"),
      users: { loading: true }
    });
    userService.getAll().then(users => this.setState({ users }));
  }

  render() {
    const { user, users } = this.state;
    return (
      <div className="col-md-6 col-md-offset-3">
        <h1>Hi {JSON.stringify(user)}!</h1>
        <h1>Dai {user.username}!</h1>
        <h1>Dai2 {user}!</h1>
        <p>You're logged in with React & Basic HTTP Authentication!!</p>
        <h3>Users from secure api end point:</h3>
        {users.loading && <em>Loading users...</em>}
        {users.length && (
          <ul>
            {users.map((user, index) => (
              <li key={user.id}>{user.id + " " + user.firstname + " " + user.lastname}</li>
            ))}
          </ul>
        )}
        <p>
          <Link to="/login">Logout</Link>
        </p>
      </div>
    );
  }
}

export { HomePage };
