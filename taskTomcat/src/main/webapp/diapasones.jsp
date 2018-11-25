<%@ page import="java.util.ResourceBundle" %>
<%@ page import="view.ResourseKey" %>
<%@ page import="java.util.List" %>
<%@ page import="model.entity.Electronic" %>

<%
    ResourceBundle bundle = ResourceBundle.getBundle("messages");
    List<Electronic> electronicList = (List<Electronic>) request.getAttribute("diapasone");
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
<%=bundle.getString(ResourseKey.DIA.getKey())%>
<table border="5" width="550">
    <tr>
        <td><%=bundle.getString(ResourseKey.NAME.getKey())%></td>
        <td><%=bundle.getString(ResourseKey.POWER.getKey())%></td>
        <td><%=bundle.getString(ResourseKey.STATE.getKey())%></td>
    </tr>
    <%
        for (Electronic e:
                electronicList) {

    %>
    <tr>
        <td><%=e.getName()%></td>
        <td><%=e.getPower()%></td>
        <td><%=e.getState()%></td>
    </tr>
    <%
        }%>
</table>

<form action="" method="get">
    <input type="hidden" name="command" value="Back">
    <input type="submit" name="Back" value=<%=bundle.getString(ResourseKey.BACK.getKey())%>  >
</form>
</body>
</html>
