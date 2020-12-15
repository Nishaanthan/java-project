import React, { useState,useEffect } from 'react';

function HomePage(){
    const [succeeded, setSucceeded] = useState(false);
    const [error, setError] = useState(null);
    const [data, setData] = useState(null);

    useEffect(() => {

        axios.post(`locahost:8080/questions`).then((response) => {
            setData(response.data);
        })

        return () => {
        }
    }, [])
    return (
        <div className="home" id="paylinks">
            Welcome to homepage
        </div>
    );
}

export default HomePage;