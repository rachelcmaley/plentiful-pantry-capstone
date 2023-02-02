<template>
    <html>

<head>
    <title>Past Meals</title>
    <link rel="styleSheet" href="pastMeals.css">
    
</head>

<body>
    <div id="topElements">
        <header>Look how far you've come!</header>
    </div>

    <div id="charts">
        <div id="space"></div>
        <text id="lastWeeksTitle">Week of 00/00/00 - 00/00/00</text>
        <div></div>

        <div id="mealChart">
            <text class="day" id="sunday">Sunday</text>
            <text class="day" id="monday"> Monday</text>
            <text class="day" id="tuesday"> Tuesday</text>
            <text class="day" id="wednesday">Wednesday</text>
            <text class="day" id="thursday">Thursday</text>
            <text class="day" id="friday">Friday</text>
            <text class="day" id="saturday">Saturday</text>

            <div class="meal-container">
                <text class="meal" id="sunBfast"> Fruit and cheese </text>
                <div id=underline></div>
                <text class="meal" id="sunLunch"> Salmon salad</text>
                <div id=underline></div>
                <text class="meal" id="sunDinner"> Chicken Flortine </text>
            </div>
            
            <div class="meal-container">
                <text class="meal" id="monBfast"> Oatmeal</text> <br>
                <div id=underline></div>
                <text class="meal" id="monLunch"> Creamy herb pasta </text> <br>
                <div id=underline></div>
                <text class="meal" id="monDinner"> Steak and eggs</text><br>
            </div>

            <div class="meal-container">
            <text class="meal" id="tuesBfast"> Pancakes </text> <br> 
            <div id=underline></div>
            <text class="meal" id="tuesLunch"> Watercress Sandwich</text> <br>
            <div id=underline></div>
            <text class="meal" id="tuesDinner"> Duck breast with red wine au jus </text><br>
            </div>

            <div class="meal-container">
            <text class="meal" id="wedBfast"> Eggs Benedict </text><br>
            <div id=underline></div>
            <text class="meal" id="wedLunch"> Monte Cristo Sandwich </text> <br>
            <div id=underline></div>
            <text class="meal" id="wedDinner"> Chicken Stir fry</text> <br>
            </div>

            <div class="meal-container">
            <text class="meal" id="thursBfast"> Eggs and Toast</text> <br>
            <div id=underline></div>
            <text class="meal" id="thursLunch">Brie grilled cheese</text> <br>
            <div id=underline></div>
            <text class="meal" id="thursDinner">Asparagus and grilled chicken </text> <br>
            </div>

            <div class="meal-container">
            <text class="meal" id="friBfast">Parfiat</text> <br>
            <div id=underline></div>
            <text class="meal" id="friLunch">Chicken breast & avocado sandwich</text><br>
            <div id=underline></div>
            <text class="meal" id="friDinner">Chicken pot pie</text> <br>
            </div>

            <div class="meal-container">
            <text class="meal" id="satBfast">Homestyle potatoes and vegan sausage patties </text> <br>
            <div id=underline></div>
            <text class="meal" id="satLunch"> Carne asada fries </text><br>
            <div id=underline></div>
            <text class="meal" id="satDinner">Out to eat! </text> <br>
            </div>

        </div>
        <div>
            <div id="space"></div>
        </div>

    </div>



</body>

</template>


<style scoped>

    #topElements{
        padding-top: 80px;
        padding-bottom: 50px;
    }


    header{
        font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
        font-size: 40px;
        text-align: center;
        color: #0B6E4F;
        border: solid #0B6E4F 3px;
        width: 600px;
        border-radius: 20px;
        background-color: white;
        position: relative;
        left: 35%;
    }

    body{
        background-image: url("watermelon.jpg");
        background-repeat: no-repeat;
        background-size: cover;
    }

    #charts{
        background-color: rgb(68, 129, 68);
        border: solid green 2px;
        border-radius: 20px;
    }

    #lastWeeksTitle{
        background-color: #A5C882;
        color:white;
        font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
        font-size: 30px;

        border: solid #A5C882 1px;
        border-radius: 10px;
        margin-left: 50px;
        padding-top: 10px;
        padding-left: 10px;
        padding-right: 10px;
    }

    #space{
        padding-top: 50px;
    }

    .day{
        font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
        color: rgb(13, 117, 36);
        font-weight: bold;
        font-size: 25px;
        text-align: center;
        padding-top: 20px;
    
        
        
    }

    #mealChart{
        background-color: white;
        margin-left: 20px;
        margin-right: 20px;
        border: solid white 3px;
        border-radius: 9px;

        display: grid;
        grid-template-columns: 1fr 1fr 1fr 1fr 1fr 1fr 1fr;
    }

    .line{
        width: 50px;
        height: 300px;
    }

    .meal{
        font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
        font-size: 25px;
        padding:10px;
        color: rgb(112, 112, 112);
    }

    .meal-container
    {
        padding: 20px;
        border-right: solid 1px grey;
        width: auto;
        height: 350px;
        text-align: center;
        padding-top: 30px;
    }


    #underline{
        border-bottom: solid 1px green;
        padding-top: 20px;

    }






</style>

