/*<html>
<body>

<div>
<p>Transaction Successful</p>
<p>Trnx ID: TXN5164870</p>
</div>
</body>
</html>
Extract only transaction ID from the HTML*/

package com.Assignment02_WhileLoop;

public class Html {
    public static void main(String[] args) {
        String HTML = " <html>\n" +
                "<body>\n" +
                "<div>\n" +
                "<p>Transaction Successful</p>\n" +
                "<p>Trnx ID: TXN5164870</p>\n" +
                "</div>\n" +
                "/body>\n" +
                "</html>";
        int i = HTML.indexOf("TXN5164870");
        System.out.println(i);
        System.out.println(HTML.substring(i, 73));
    }
}
