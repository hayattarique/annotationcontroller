<!DOCTYPE html>
<%@ page isELIgnored="false"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Ticket Details</title>
<head>
  <body>
     <h2>Ticket Details</h2>
        PNR No: ${ticket.pnrNo}<br/>
        Passenger Name:  ${ticket.passengerName}<br/>
        Source:   ${ticket.source}<br/>
        Destination: ${ticket.destination}<br/>
        Travel Date: ${ticket.travelDate}<br/>
        Berth: ${ticket.berth}<br/>
        Status: ${ticket.status}
  </body>
 </html>