<%@ page import="java.util.ResourceBundle" %>
<%@ page import="view.ResourseKey" %>
<%@ page import="java.util.List" %>
<%@ page import="model.entity.HouseHoldElectronic" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.entity.EntertainmentElectronic" %>

<%
    ResourceBundle bundle = ResourceBundle.getBundle("messages");
    List<HouseHoldElectronic> houseHoldElectronics = (ArrayList<HouseHoldElectronic>) request.getAttribute("householdlist");
    List<EntertainmentElectronic> entertainmentElectronics = (ArrayList<EntertainmentElectronic>) request.getAttribute("entertaimentlist");
    int powerSum = 0;
%>
<html>
<head>
    <meta charset="UTF-8 ">
    <link rel="stylesheet" type="text/css" href="style.css"/>
</head>

<body>
<header>
    <h2 align="center"><%=bundle.getString(ResourseKey.WELCOME.getKey())%></h2>
    <table align="right">
        <tr>
            <td>
                <form action="" method="get">
                    <input type="hidden" name="command" value="UaLocale">
                    <input type="submit" name="UaLocale" value="UA">
                </form>
            </td>
            <td>
                <form action="" method="get">
                    <input type="hidden" name="command" value="EnLocale">
                    <input type="submit" name="EnLocale" value="EN">
                </form>
            </td>
        </tr>
    </table>
</header>
<%=bundle.getString(ResourseKey.TABLE_HOUSEHOLD.getKey())%>
<table border="5" width="550">
    <tr>
        <td><%=bundle.getString(ResourseKey.NAME.getKey())%></td>
        <td><%=bundle.getString(ResourseKey.POWER.getKey())%></td>
        <td><%=bundle.getString(ResourseKey.STATE.getKey())%></td>
        <td><%=bundle.getString(ResourseKey.SPEED.getKey())%></td>
    </tr>
    <%
        for (HouseHoldElectronic h:
             houseHoldElectronics) {
            if(h.getState()){
                powerSum = powerSum + h.getPower();
            }
            %>
    <tr>
    <td><%=h.getName()%></td>
    <td><%=h.getPower()%></td>
    <td><%=h.getState()%></td>
    <td><%=h.getSpeed()%></td>
    </tr>
            <%
        }%>
    </table>

    <br><br>
    <%=bundle.getString(ResourseKey.TABLE_ENTERTAIMENT.getKey())%>

    <table border="5", width="550">
        <tr>
            <td><%=bundle.getString(ResourseKey.NAME.getKey())%></td>
            <td><%=bundle.getString(ResourseKey.POWER.getKey())%></td>
            <td><%=bundle.getString(ResourseKey.STATE.getKey())%></td>
            <td><%=bundle.getString(ResourseKey.VOLUME.getKey())%></td>
        </tr>

        <%
            for (EntertainmentElectronic e:
            entertainmentElectronics) {
                if(e.getState()){
                    powerSum = powerSum + e.getPower();
                }
        %>
        <tr>
            <td><%=e.getName()%></td>
            <td><%=e.getPower()%></td>
            <td><%=e.getState()%></td>
            <td><%=e.getVolume()%></td>
        </tr>
        <%
            }%>

    </table>

<br><br>

<%=bundle.getString(ResourseKey.SUM.getKey())%> = <%=powerSum%>

<br><br>
<%=bundle.getString(ResourseKey.INP_DIA.getKey())%>:
<br>
<form action="" method="get">
    <input type="number" id="min" name="min">
    <input type="number" id="max" name="max">
    <input type="hidden" name="command" value="Search">
    <input type="submit" name="Search" value=<%=bundle.getString(ResourseKey.SEARCH.getKey())%>>
</form>


</body>
</html>
