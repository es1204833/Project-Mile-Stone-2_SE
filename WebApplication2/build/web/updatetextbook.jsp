<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
    <head>
        <title>Update TextBook</title>
        <link rel="stylesheet" href="css/styles.css" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        
    </head>
    <body>
        <jsp:include page="header.jsp" />
        <h3>Update TextBook</h3>
        <form action="updateTextBook" method="post">
            <input value="${textbook.isbn}" type="hidden" id = "isbn" name="isbn" />
             <label>Title
                <input value="${textbook.title}" type="text" id = "title" name="title" required/>
            </label> 
            <label>Authors
                <input value="${textbook.author}"type="text" id = "author" name="author" />
            </label>
            <label>Year
                <input value="${textbook.year}" type="number" id = "year" name="year" required />
            </label>
            <label>Publisher
                <input value="${textbook.publisher}" type="text" id = "publisher" name="publisher" required />
            </label>
            <label>Image
                <input value="${textbook.image}" type="number" id = "image" name="image" />
            </label>
            <label>Status
                <input value="${textbook.status}" type="text" id = "status" name="status" />
            </label>
            <label>Number of copies 
                <input value="${textbook.noOfCopies}" type="number" id = "noOfCopies" name="noOfCopies" />
            </label>
             <label>Date
                <input value="${textbook.date}"  type="Date" id = "date" name="date" />
            </label>
            
             <input type="submit" id="submit" value="Submit" />
        </form>
    </body>
</html>