
<!DOCTYPE html>
<html>
    <head>
        <title>Modify Number Of Copies</title>
        <link rel="stylesheet" href="css/style.css" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <link rel="stylesheet" href="css/styles.css" />
    </head>
    <body>
        
        <jsp:include page="header.jsp" />
        <h3>Modify Number Of Copies</h3>
        <form action="ModifyNumberOfcopies" method="post">
             <label> Enter ISBN </label>

                
            <input type="text" id = "isbn" name="Isbn" required />
            
            <input type="submit" id="submit" value="Search" />
                       <br>
           
          <div class="range-selector">
                    <label for="maleCopies">Male Copies: 
                        <output id="selectedMaleCopies" for="maleCopies"></output>
                    </label>
                    <input type="range" id="maleCopies" name="maleCopies"
                           min="1" max="50" 
                           >
          </div>
            <div class="range-selector">
                    <label for="femaleCopies">Female Copies: 
                        <output id="selectedFemaleCopies" for="femaleCopies"></output>
                    </label>
                    <input type="range" id="femaleCopies" name="femaleCopies"
                           min="1" max="50" 
                           >
            </div>
                 <div class="range-selector">

                    <label for="instructorCopies">Instructor Copies: 
                        <output id="selectedInstructorCopies" for="instructorCopies"></output>
                    </label>
                    <input type="range" id="instructorCopies" name="instructorCopies"
                           min="1" max="50" >
                           
                
          
                </div>
               
                   
                   
                <br>
                <br>
                <input type="submit" id="request order" value="Request Order" />
                Your request has been saved and being processed 
                
                <br>
                <br>
                <div>
                <input type="submit" id="save" value="Save" />   
                <input type="submit" id="cancel" value="Cancel" />
                </div>



            
        </form>
    </body>
</html>


