<%@ page import="java.util.ResourceBundle" %>
<%@ page import="view.ResourseKey" %>
<%@ page import="java.util.Locale" %>

<%
    ResourceBundle bundle = ResourceBundle.getBundle("messages");
%>
<html>
    <head>
        <meta charset="UTF-8">
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

        <form action="" method="get">
            <input align="center" type="hidden" name="command" value="Electronics">
            <input align="center" type="submit" name="Electronics" value=<%=bundle.getString(ResourseKey.TABLES.getKey())%>>
        </form>






    </body>
</html>
