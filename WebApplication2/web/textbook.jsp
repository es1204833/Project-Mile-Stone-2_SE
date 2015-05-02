<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
    <head>
        <title>TextBooks</title>
        <link rel="stylesheet" href="css/styles.css" />
    </head>
    <body>

        <jsp:include page="header.jsp" />
        <h3>TextBooks</h3>

        <c:if test='${not empty message}'>
            <p class='message'>${message}</p>
            <c:remove var="message" scope="session" />
        </c:if>

        <table id="textbookListTable">
            <thead>
                <tr>
                    <th>Isbn</th>
                    <th>Title</th>
                    <th>Author</th>
                    <th>Year</th>
                    <th>Publisher</th>
                    <th>Price</th>
                    <th>Image</th>
                    <th>Status</th>
                    <th>No Of required copies</th>
                    <th>Date</th>
                    <th colspan="2"></th>
                </tr>
            </thead>
            <tbody>

                                <c:forEach var="textbook" items="${requestScope.textBookList}">
                    <tr>
                        <td>${textbook.isbn}</td> 
                        <td>${textbook.title}</td> 
                        <td>${textbook.author}</td> 
                        <td>${textbook.year}</td>
                        <td>${textbook.publiser}</td> 
                        <td>${textbook.price}</td>
                        <td>${textbook.image}</td> 
                        <td>${textbook.status}</td> 
                        <td>${textbook.noOfCopies} </td>
                        <td>${textbook.date} </td>
                                     
                    </tr>
                </c:forEach>

            </tbody>
        </table>
    </body>
</html>
