<%-- 
    Document   : takeAttendance
    Created on : Oct 13, 2022, 1:22:42 AM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link rel="stylesheet" href="main.css" />
  </head>
  <body>
    <div class="container">
      <h1>Single activity Attendance</h1>
      <br />
      <p>
        Attendance for (class) with lecture (teacher) at (slot) on (time),in
        (room) at FU-HL
      </p>
      <table border="1px">
        <thead id="table-head">
          <tr>
            <td>No</td>
            <td>Group</td>
            <td>Code</td>
            <td>Name</td>
            <td>Image</td>
            <td>Status</td>
            <td>Comment</td>
            <td>Taker</td>
            <td>Record Time</td>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>1</td>
            <td>IOT1602</td>
            <td>HE140145</td>
            <td>Phan Hoàng Tùng</td>
            <td><img src="img/Screenshot 2022-10-13 002829.png" /></td>
            <td>
              attendance<input
                type="radio"
                name="checkAttendance"
                value="attendance"
              /><br />
              absent<input type="radio" name="checkAttendance" value="absent" />
            </td>
            <td>Comment</td>
            <td>Taker</td>
            <td>Record Time</td>
          </tr>
        </tbody>
      </table>
      <input type="submit" value="SAVE" />
    </div>
  </body>
</html>
