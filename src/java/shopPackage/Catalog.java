package shopPackage;

/** A catalog that lists the items available in inventory.
 *  <P>
 *  Taken from Core Servlets and JavaServer Pages 2nd Edition
 *  from Prentice Hall and Sun Microsystems Press,
 *  http://www.coreservlets.com/.
 *  &copy; 2003 Marty Hall; may be freely used or adapted.
 */

public class Catalog {
  // This would come from a database in real life.
  // We use a static table for ease of testing and deployment.
  // See JDBC chapters for info on using databases in
  // servlets and JSP pages.
    
    public static String htmlStartString(String title)
    {
        String htmlStart =
            "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
            "Transitional//EN\">\n" + "<HTML>\n" +
            "<HEAD><TITLE>" + title + "</TITLE>" +
               "<link rel=\"stylesheet\" type=\"text/css\" href=\"assignment1.css\" />" + "</HEAD>\n" +
            "<BODY BGCOLOR=\"#81DAF5\" align=\"center\">\n";
        return htmlStart;
    }
    
    private static CatalogItem[] items =
    { new CatalogItem
      ("5",
       "<I>Core Servlets and JavaServer Pages " +
         "2nd Edition</I> (Volume 1)" +
         " by Marty Hall and Larry Brown",
       "The definitive reference on servlets " +
         "and JSP from Prentice Hall and \n" +
         "Sun Microsystems Press.<P>Nominated for " +
         "the Nobel Prize in Literature.",
       39.95, "imageName"),
      new CatalogItem
        ("4",
         "<I>Core Web Programming, 2nd Edition</I> " +
           "by Marty Hall and Larry Brown",
         "One stop shopping for the Web programmer. " +
           "Topics include \n" +
           "<UL><LI>Thorough coverage of Java 2; " +
           "including Threads, Networking, Swing, \n" +
           "Java 2D, RMI, JDBC, and Collections\n" +
           "<LI>A fast introduction to HTML 4.01, " +
           "including frames, style sheets, and layers.\n" +
           "<LI>A fast introduction to HTTP 1.1, " +
           "servlets, and JavaServer Pages.\n" +
           "<LI>A quick overview of JavaScript 1.2\n" +
           "</UL>",
         49.99, "imageName"),
      new CatalogItem
        ("1",
         "<I>Superman</I> by C.S. Lewis",
           "The classic children's adventure pitting " +
           "Aslan the Great Lion and his followers\n" +
           "against the White Witch and the forces " +
           "of evil. Dragons, magicians, quests, \n" +
           "and talking animals wound around a deep " +
           "spiritual allegory. Series includes\n" +
           "<I>The Magician's Nephew</I>,\n" +
           "<I>The Lion, the Witch and the Wardrobe</I>,\n" +
           "<I>The Horse and His Boy</I>,\n" +
           "<I>Prince Caspian</I>,\n" +
           "<I>The Voyage of the Dawn Treader</I>,\n" +
           "<I>The Silver Chair</I>, and \n" +
           "<I>The Last Battle</I>.",
         19.95, "imageName"),
      new CatalogItem
        ("2",
         "<I>The Prydain Series</I> by Lloyd Alexander",
           "Humble pig-keeper Taran joins mighty " +
           "Lord Gwydion in his battle against\n" +
           "Arawn the Lord of Annuvin. Joined by " +
           "his loyal friends the beautiful princess\n" +
           "Eilonwy, wannabe bard Fflewddur Fflam," +
           "and furry half-man Gurgi, Taran discovers " +
           "courage, nobility, and other values along\n" +
           "the way. Series includes\n" +
           "<I>The Book of Three</I>,\n" +
           "<I>The Black Cauldron</I>,\n" +
           "<I>The Castle of Llyr</I>,\n" +
           "<I>Taran Wanderer</I>, and\n" +
           "<I>The High King</I>.",
         19.95, "imageName"),
      new CatalogItem
        ("3",
         "<I>The Harry Potter Series</I> by J.K. Rowling",
         "The first five of the popular stories " +
           "about wizard-in-training Harry Potter\n" +
           "topped both the adult and children's " +
           "best-seller lists. Series includes\n" +
           "<I>Harry Potter and the Sorcerer's Stone</I>,\n" +
           "<I>Harry Potter and the Chamber of Secrets</I>,\n" +
           "<I>Harry Potter and the " +
           "Prisoner of Azkaban</I>,\n" +
           "<I>Harry Potter and the Goblet of Fire</I>, and\n" +
           "<I>Harry Potter and the "+
           "Order of the Phoenix</I>.\n",
         59.95, "imageName"),
      new CatalogItem
        ("6",
         "<I>Core Web Programming, 2nd Edition</I> " +
           "by Marty Hall and Larry Brown",
         "One stop shopping for the Web programmer. " +
           "Topics include \n" +
           "<UL><LI>Thorough coverage of Java 2; " +
           "including Threads, Networking, Swing, \n" +
           "Java 2D, RMI, JDBC, and Collections\n" +
           "<LI>A fast introduction to HTML 4.01, " +
           "including frames, style sheets, and layers.\n" +
           "<LI>A fast introduction to HTTP 1.1, " +
           "servlets, and JavaServer Pages.\n" +
           "<LI>A quick overview of JavaScript 1.2\n" +
           "</UL>",
         49.99, "imageName"),
      new CatalogItem
        ("7",
         "<I>The Chronicles of Narnia</I> by C.S. Lewis",
           "The classic children's adventure pitting " +
           "Aslan the Great Lion and his followers\n" +
           "against the White Witch and the forces " +
           "of evil. Dragons, magicians, quests, \n" +
           "and talking animals wound around a deep " +
           "spiritual allegory. Series includes\n" +
           "<I>The Magician's Nephew</I>,\n" +
           "<I>The Lion, the Witch and the Wardrobe</I>,\n" +
           "<I>The Horse and His Boy</I>,\n" +
           "<I>Prince Caspian</I>,\n" +
           "<I>The Voyage of the Dawn Treader</I>,\n" +
           "<I>The Silver Chair</I>, and \n" +
           "<I>The Last Battle</I>.",
         19.95, "imageName"),
      new CatalogItem
        ("8",
         "<I>Noddy</I> by Lloyd Alexander",
           "Humble pig-keeper Taran joins mighty " +
           "Lord Gwydion in his battle against\n" +
           "Arawn the Lord of Annuvin. Joined by " +
           "his loyal friends the beautiful princess\n" +
           "Eilonwy, wannabe bard Fflewddur Fflam," +
           "and furry half-man Gurgi, Taran discovers " +
           "courage, nobility, and other values along\n" +
           "the way. Series includes\n" +
           "<I>The Book of Three</I>,\n" +
           "<I>The Black Cauldron</I>,\n" +
           "<I>The Castle of Llyr</I>,\n" +
           "<I>Taran Wanderer</I>, and\n" +
           "<I>The High King</I>.",
         19.95, "imageName"),
      new CatalogItem
        ("9",
         "<I>Tintin</I> by J.K. Rowling",
         "The first five of the popular stories " +
           "about wizard-in-training Harry Potter\n" +
           "topped both the adult and children's " +
           "best-seller lists. Series includes\n" +
           "<I>Harry Potter and the Sorcerer's Stone</I>,\n" +
           "<I>Harry Potter and the Chamber of Secrets</I>,\n" +
           "<I>Harry Potter and the " +
           "Prisoner of Azkaban</I>,\n" +
           "<I>Harry Potter and the Goblet of Fire</I>, and\n" +
           "<I>Harry Potter and the "+
           "Order of the Phoenix</I>.\n",
         59.95, "imageName")
        };

  public static CatalogItem getItem(String itemID) {
    CatalogItem item;
    if (itemID == null) {
      return(null);
    }
        for (CatalogItem item1 : items) {
            item = item1;
            if (itemID.equals(item.getItemID())) {
                return(item);
            } }
    return(null);
  }
}
               