

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Ratings & Comments</title>
    </head>
    <body>
          <jsp:include page="header.jsp" />
        <h1> View Ratings And Comments </h1>
        <p>Please click on the button to go to Amazon website to be able to view 
        a book Rating & comments</p>
        <label> TextBook Name
                <input type="text" id = "isbn" name="Isbn" required />
            </label>
        <form action="http://www.amazon.com/books/ ">
    <input type="submit" value="Go to Amazon to view ratings & comments">
</form>
    </body>
</html>
