<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
    <head>
        <title>Add TextBook</title>
        <link rel="stylesheet" href="css/styles.css" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        
    </head>
    <body>
        <jsp:include page="header.jsp" />
        <h3>Add TextBook</h3>
        <form action="addTextBook" method="post">
            <label> TextBook Isbn
                <input type="number" id = "isbn" name="Isbn" required />
            </label>
            <label>Title
                <input type="text" id = "title" name="title" required/>
            </label> 
            <label>Authors
                <input type="text" id = "author" name="author" />
            </label>
            <label>Year
                <input type="number" id = "year" name="year" required />
            </label>
            <label>Publisher
                <input type="text" id = "publisher" name="publisher" required />
            </label>
            <label>Price
                <input type="number" id = "publisher" name="publisher" required />
            </label>
            <label>Image
                <input type="number" id = "image" name="image" />
            </label>
            <label>Status
                <input type="text" id = "status" name="status" />
            </label>
            <label>Number of copies 
                <input type="number" id = "noOfCopies" name="noOfCopies" />
            </label>
             <label>Date
                <input type="Date" id = "date" name="date" />
            </label>
                       
            <input type="submit" id="submit" value="Submit" />
        </form>
    </body>
</html>

