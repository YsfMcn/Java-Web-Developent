package bythecake;

public class Menu {

    public static void main(String[] args) {

        String type = "Content-Typer: text/html" + System.lineSeparator();

        String output =
                ""
                        + "<html>"
                        + HtmlElements.HEADER_ELEMENTS
                        + "<body>"
                        + "<h1>By The Cake</h1>"
                        + "<h2>Enjoy our awesome cakes</h2>"
                        + "<hr />";


        output +=
                "<ul>"
                        + "<li>"
                        + "<a href=\"/cgi-bin/home.cgi\">Home</a>"
                        + "<ol>"
                        + "<li>"
                        + "<a href=\"/cgi-bin/home.cgi#cakes\">Our cakes</a>"
                        + "</li>"
                        + "<li>"
                        + "<a href=\"/cgi-bin/home.cgi#stores\">Our stores</a>"
                        + "</li>"
                        + "</ol>"
                        + "</li>"
                        + "<li><a href=\"/cgi-bin/add_cakes.cgi\">Add cake</a></li>"
                        + "<li><a href=\"/cgi-bin/browse_cakes.cgi\">Browse cakes</a></li>"
                        + "<li><a href=\"/cgi-bin/aboutus.cgi\">About Us</a></li>"
                        + "</ul>";
        output +=
                HtmlElements.FOOTER_ELEMENT
                        + "</body>"
                        + "</html>";

        System.out.println(type);
        System.out.println(output);

    }
}
