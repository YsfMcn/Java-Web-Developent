package bythecake;


public class Home {

    public static void main(String[] args) {


        String type = "Content-Typer: text/html" + System.lineSeparator();

        String output =
                ""
                        + "<html>"
                        + HtmlElements.HEADER_ELEMENTS
                        + "<body>"
                        + "<a href=\"/cgi-bin/menu.cgi\">Back to Menu</a>"
                        + "<h2>Home</h2>"

                ;


        //Our cake section

        output +=
                ""
                        + "<section id=\"cakes\">"
                        + "<h3>Our cakes</h3>"
                        + "<p><strong><em>Cake</em></strong> is a form of <strong><em>sweet dessert</em></strong> that is typically baked. In its oldest forms, "
                        + "<strong><em>cakes</em></strong> were modifications of breads, but <strong><em>cakes</em></strong> now cover a wide range of preparations"
                        + "that can be simple or elaborate, and that share features with other <strong><em>desserts</em></strong> such as "
                        + "pastries, meringues, custards, and pies</p>"
                        + "<img src=\"/cake.jpg\" alt=\"Cake image...\" width=\"500\" height=\"500\">    "
                        + "</section>"
        ;


        //Our cake stores section

        output +=
                ""
                        + "<section id=\"stores\">"
                        + "<h3>Our stores</h3>"
                        + "<p>Our <strong><em>stores</em></strong> are located in 21 cities all over the world. "
                        + "Come and see what we have for you.</p>"
                        + "<img src=\"/cakeStore.jpg\" alt=\"Cake store image...\" width=\"500\" height=\"500\">    "
                        + "</section>"
        ;

        output +=
                HtmlElements.FOOTER_ELEMENT
                        + "</body>"
                        + "</html>";

        System.out.println(type);
        System.out.println(output);


    }

}
