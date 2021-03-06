import React from "react";
import { BrowserRouter, Switch, Route} from 'react-router-dom';

import HomePage from './pages/homepage';

export default function Routes() {
    return(
        <BrowserRouter> 
            <Switch>
                <Route path="/" component={HomePage} />
            </Switch>
        </BrowserRouter>
    );
}