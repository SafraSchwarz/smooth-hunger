import React, { useState, useEffect } from "react";
import { Switch, Route, Link, Redirect } from "react-router-dom";

import LandingPage from "./LandingPage";

const NavBar = (props) => {
  return (
    <div>
      <Switch>
        <Route exact path="/" component={LandingPage} />
      </Switch>
    </div>
  );
};

export default NavBar;
