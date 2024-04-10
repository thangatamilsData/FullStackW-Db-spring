import React, { useState, useEffect } from 'react'
import './YourComponent.css'

function YourComponent() {
  const [data, setData] = useState(null)

  useEffect(() => {
    fetch('http://localhost:8080/api/v1/tamil/vicky')
      .then((res) => res.json())
      .then((val) => {
        console.log("it's definitely working!" + val)
        setData(val)
      })
      .catch((error) => {
        console.error('Error fetching data:', error)
      })
  }, [])
  return (
    <div>
      <div className='cl'>
        {data ? (
          <div>
            <h2>Login</h2>
            <h5>Id : </h5> <button>{data.id}</button>
            <p>
              <h5>Username:</h5> <button>{data.name}</button>
            </p>
            <p>
              <h5>Email:</h5> <button> {data.email}</button>
            </p>
            <p>
              <h5>Role:</h5> <button>{data.age} </button>
            </p>
          </div>
        ) : (
          <p></p>
        )}
      </div>
    </div>
  )
}

export default YourComponent
