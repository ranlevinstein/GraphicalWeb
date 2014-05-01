// 

import java.util.LinkedList;
import java.util.List;
import java.util.regex.*;

public class Main1 {
    
    
    static List<String> matchingResults = new LinkedList<>();
    static List<String> fullWords  = new LinkedList<>();
    
    static List<String> step2Words  = new LinkedList<>();
    static List<String> finalDates = new LinkedList<>();
    static List<Integer> starts = new LinkedList<>();
    static List<Integer> ends = new LinkedList<>();
    static List<Integer> sentenceStarts = new LinkedList<>();
    static List<Integer> sentenceEnds = new LinkedList<>();
    static int arrofDates [];
    static int sortedDates[];
    static List<String> meanings = new LinkedList<>();
    
    public static void main(String[]args)
    {
 
        //April 1, 1976
        // April-1-,-1976??
        //January|February|March|April|May|June|July|August|September|October|November|December 
        String input = "Apple Inc. is an American multinational corporation headquartered in Cupertino, California, that designs, develops, and sells consumer electronics, computer software and personal computers. Its best-known hardware products are the Mac line of computers, the iPod media player, the iPhone smartphone, and the iPad tablet computer. Its consumer software includes the OS X and iOS operating systems, the iTunes media browser, the Safari web browser, and the iLife and iWork creativity and productivity suites. Apple was founded by Steve Jobs, Steve Wozniak, and Ronald Wayne on April 1, 1976 to develop and sell personal computers. It was incorporated as Apple Computer, Inc. on January 3, 1977, and was renamed as Apple Inc. on January 9, 2007 to reflect its shifted focus towards consumer electronics. Apple is the world's second-largest information technology company by revenue after Samsung Electronics, and the world's third-largest mobile phone maker after Samsung and Nokia.[6] Fortune magazine named Apple the most admired company in the United States in 2008, and in the world from 2008 to 2012.[7][8][9][10][11] On September 30, 2013, Apple surpassed Coca-Cola to become the world's most valuable brand in the Omnicom Group's Best Global Brands report.[12] However, the company has received criticism for its contractors' labor practices, and for Apple's own environmental and business practices. As of May 2013, Apple maintains 408 retail stores in fourteen countries[13][14] as well as the online Apple Store and iTunes Store,[15] the latter of which is the world's largest music retailer.[16] Apple is the largest publicly traded corporation in the world by market capitalization, with an estimated market capitalization of $446 billion by January, 2014.[17] As of September 29, 2012, the company had 72,800 permanent full-time employees and 3,300 temporary full-time employees worldwide. Its worldwide annual revenue in 2013 totalled $170 billion.[18] As of Q1 2014, Apple's five-year growth average is 39% for top line growth and 45% for bottom line growth. In May 2013, Apple entered the top ten of the Fortune 500 list of companies for the first time, rising 11 places above its 2012 ranking to take the sixth position.[19] Contents  [hide] 1 History1.1 1976?80: Founding and incorporation. 2 1981?89: Success with Macintosh 1.3 1990?99: Decline and restructuring 1.4 2000?06: Return to profitability The Apple I, Apple's first product, was sold as an assembled circuit board and lacked basic features such as a keyboard, monitor, and case. The owner of this unit added a keyboard and a wooden case. Apple was established on April 1, 1976, by Steve Jobs, Steve Wozniak and Ronald Wayne[20][21] to sell the Apple I personal computer kit, a computer single handedly designed by Wozniak. The kits were hand-built by Wozniak[22][23] and first shown to the public at the Homebrew Computer Club.[24] The Apple I was sold as a motherboard (with CPU, RAM, and basic textual-video chips), which is less than what is today considered a complete personal computer.[25] The Apple I went on sale in July 1976 and was market-priced at $666.66 ($2,763 in 2014 dollars, adjusted for inflation).[26][27][28][29][30][31] Apple was incorporated January 3, 1977,[32] without Wayne, who sold his share of the company back to Jobs and Wozniak for $800.[21] Multi-millionaire Mike Markkula provided essential business expertise and funding of $250,000 during the incorporation of Apple.[33][34] During the first five years of operations, revenues doubled every four months, an average growth rate of 700%. The Apple II, also invented by Wozniak, was introduced on April 16, 1977, at the first West Coast Computer Faire. It differed from its major rivals, the TRS-80 and Commodore PET, due to its character cell-based color graphics and an open architecture. While early models used ordinary cassette tapes as storage devices, they were superseded by the introduction of a 5 1/4 inch floppy disk drive and interface, the Disk II.[35] The Apple II was chosen to be the desktop platform for the first killer app of the business world, VisiCalc, a spreadsheet program.[36] VisiCalc created a business market for the Apple II and gave home users compatibility with the office, an additional reason to buy an Apple II.[36] Apple was a distant third place to Commodore and Tandy until VisiCalc came along.[37][38] By the end of the 1970s, Apple had a staff of computer designers and a production line. The company introduced the Apple III in May 1980 in an attempt to compete with IBM and Microsoft in the business and corporate computing market.[39] Jobs and several Apple employees, including Jef Raskin, visited Xerox PARC in December 1979 to see the Xerox Alto. Xerox granted Apple engineers three days of access to the PARC facilities in return for the option to buy 100,000 shares (800,000 split-adjusted shares) of Apple at the pre-IPO price of $10 a share.[40] Jobs was immediately convinced that all future computers would use a graphical user interface (GUI), and development of a GUI began for the Apple Lisa.[41] On December 12, 1980, Apple went public at $22 per share,[42] generating more capital than any IPO since Ford Motor Company in 1956 and instantly creating more millionaires (about 300) than any company in history.[43] 1981?89: Success with Macintosh See also: Timeline of Macintosh models Apple's 1984 television ad, set in a dystopian future modeled after the George Orwell novel Nineteen Eighty-Four, set the tone for the introduction of the Macintosh. Apple began working on the Apple Lisa in 1978. In 1982, Jobs was pushed from the Lisa team due to infighting. Jobs took over Jef Raskin's low-cost-computer project, the Macintosh. A race broke out between the Lisa team and the Macintosh team over which product would ship first. Lisa won the race in 1983 and became the first personal computer sold to the public with a GUI, but was a commercial failure due to its high price tag and limited software titles.[44] The first Macintosh, released in 1984 In 1984, Apple next launched the Macintosh. Its debut was announced by the now famous $1.5 million television commercial 1984. It was directed by Ridley Scott and was aired during the third quarter of Super Bowl XVIII on January 22, 1984.[45] It is now hailed as a watershed event for Apple's success[46] and a masterpiece.[47][48] The Macintosh initially sold well, but follow-up sales were not strong[49] due to its high price and limited range of software titles. The Macintosh was the first personal computer to be sold without a programming language at all.[50] The machine's fortunes changed with the introduction of the LaserWriter, the first PostScript laser printer to be sold at a reasonable price, and PageMaker, an early desktop publishing package. It has been suggested that the combination of these three products was responsible for the creation of the desktop publishing market.[51] The Mac was particularly powerful in the desktop publishing market due to its advanced graphics capabilities, which had necessarily been built in to create the intuitive Macintosh GUI. In 1985 a power struggle developed between Jobs and CEO John Sculley, who had been hired two years earlier.[52] The Apple board of directors instructed Sculley to contain Jobs and limit his ability to launch expensive forays into untested products. Rather than submit to Sculley's direction, Jobs attempted to oust him from his leadership role at Apple. Sculley found out that Jobs had been attempting to organize a coup and called a board meeting at which Apple's board of directors sided with Sculley and removed Jobs from his managerial duties.[49] Jobs resigned from Apple and founded NeXT Inc. the same year.[53] The Macintosh Portable was Apple's first portable Macintosh computer, released in 1989. The Macintosh Portable was introduced in 1989 and was designed to be just as powerful as a desktop Macintosh, but weighed a bulky 7.5 kilograms (17 lb) with a 12-hour battery life. After the Macintosh Portable, Apple introduced the PowerBook in 1991. The same year, Apple introduced System 7, a major upgrade to the operating system which added color to the interface and introduced new networking capabilities. It remained the architectural basis for Mac OS until 2001. The success of the PowerBook and other products brought increasing revenue.[52] For some time, Apple was doing incredibly well, introducing fresh new products and generating increasing profits in the process. The magazine MacAddict named the period between 1989 and 1991 as the first golden age of the Macintosh. Following the success of the Macintosh LC, Apple introduced the Centris line, a low-end Quadra, and the ill-fated Performa line that was sold with an overwhelming number of configurations and software bundles to avoid competing with the various consumer outlets such as Sears, Price Club, and Wal-Mart (the primary dealers for these models). Consumers ended up confused and did not understand the difference between models.[54] 1990?99: Decline and restructuring See also: Timeline of Apple II family During this time Apple experimented with a number of other failed consumer targeted products including digital cameras, portable CD audio players, speakers, video consoles, and TV appliances. Enormous resources were also invested in the problem-plagued Newton division based on John Sculley's unrealistic market forecasts.[citation needed] Ultimately, none of these products helped, as Apple's market share and stock prices continued to slide.[citation needed] Apple saw the Apple II series as too expensive to produce, while taking away sales from the low-end Macintosh.[55] In 1990, Apple released the Macintosh LC with a single expansion slot for the Apple IIe Card to migrate Apple II users to the Macintosh platform.[55] Apple stopped selling the Apple IIe in 1993. Microsoft continued to gain market share with Windows focusing on delivering software to cheap commodity personal computers while Apple was delivering a richly engineered, but expensive, experience.[56] Apple relied on high profit margins and never developed a clear response. Instead, they sued Microsoft for using a graphical user interface similar to the Apple Lisa in Apple Computer, Inc. v. Microsoft Corporation.[57] The lawsuit dragged on for years before it was finally dismissed. At the same time, a series of major product flops and missed deadlines sullied Apple's reputation, and Sculley was replaced as CEO by Michael Spindler.[58] The Newton was Apple's first foray into the PDA markets, as well as one of the first in the industry. Despite being a financial flop at the time of its release, it helped pave the way for the Palm Pilot and Apple's own iPhone and iPad in the future. By the early 1990s, Apple was developing alternative platforms to the Macintosh, such as the A/UX. Apple had also begun to experiment in providing a Mac-only online portal which they called eWorld, developed in collaboration with America Online and designed as a Mac-friendly alternative to other online services such as CompuServe. The Macintosh platform was itself becoming outdated because it was not built for multitasking, and several important software routines were programmed directly into the hardware. In addition, Apple was facing competition from OS/2 and UNIX vendors such as Sun Microsystems. The Macintosh would need to be replaced by a new platform, or reworked to run on more powerful hardware.[59] In 1994, Apple allied with IBM and Motorola in the AIM alliance. The goal was to create a new computing platform (the PowerPC Reference Platform), which would use IBM and Motorola hardware coupled with Apple's software. The AIM alliance hoped that PReP's performance and Apple's software would leave the PC far behind, thus countering Microsoft. The same year, Apple introduced the Power Macintosh, the first of many Apple computers to use Motorola's PowerPC processor.[60] In 1996, Michael Spindler was replaced by Gil Amelio as CEO. Gil Amelio made many changes at Apple, including extensive layoffs.[61] After numerous failed attempts to improve Mac OS, first with the Taligent project, then later with Copland and Gershwin, Amelio chose to purchase NeXT and its NeXTSTEP operating system, bringing Steve Jobs back to Apple as an advisor.[62] On July 9, 1997, Amelio was ousted by the board of directors after overseeing a three-year record-low stock price and crippling financial losses. Jobs acted as the interim CEO and began restructuring the company's product line; it was during this period that Jobs identified Jonathan Ive's design talent and the pair worked collaboratively to rebuild Apple's status.[63] At the 1997 Macworld Expo, Jobs announced that Apple would join Microsoft to release new versions of Microsoft Office for the Macintosh, and that Microsoft had made a $150 million investment in non-voting Apple stock.[64] On November 10, 1997, Apple introduced the Apple Online Store, tied to a new build-to-order manufacturing strategy.[65][66] On August 15, 1998, Apple introduced a new all-in-one computer reminiscent of the Macintosh 128K: the iMac. The iMac design team was led by Ive, who would later design the iPod and the iPhone.[67][68] The iMac featured modern technology and a unique design, and sold almost 800,000 units in its first five months.[69]Through this period, Apple purchased several companies to create a portfolio of professional and consumer-oriented digital production software. In 1998, Apple announced the purchase of Macromedia's Final Cut software, signaling its expansion into the digital video editing market.[70] The following year, Apple released two video editing products: iMovie for consumers and, for professionals, Final Cut Pro, which has gone on to be a significant video-editing program, with 800,000 registered users in early 2007.[71] In 2002, Apple purchased Nothing Real for their advanced digital compositing application Shake,[72] as well as Emagic for their music productivity application Logic, which led to the development of their consumer-level GarageBand application.[73][74] iPhoto's release the same year completed the iLife suite.[75] 2000?06: Return to profitability Main article: Apple's transition to Intel processors Apple retail stores allow potential customers to use floor models without making a purchase. (Apple Store, North Michigan Avenue, Chicago, Illinois in 2005) Mac OS X, based on NeXT's OPENSTEP and BSD Unix, was released on March 24, 2001 after several years of development. Aimed at consumers and professionals alike, Mac OS X aimed to combine the stability, reliability and security of Unix with the ease of use afforded by an overhauled user interface. To aid users in migrating from Mac OS 9, the new operating system allowed the use of OS 9 applications within Mac OS X as the Classic environment, which meant that users were able to continue running their old applications.[76] On May 19, 2001, Apple opened the first official Apple Retail Stores in Virginia and California.[77] On July 9, they bought Spruce Technologies, a DVD authoring company. On October 23 of the same year, Apple announced the iPod portable digital audio player, and started selling it on November 10. The product was phenomenally successful ? over 100 million units were sold within six years.[78][79] In 2003, Apple's iTunes Store was introduced, offering online music downloads for $0.99 a song and integration with the iPod. The service quickly became the market leader in online music services, with over 5 billion downloads by June 19, 2008.[80] Since 2001, Apple's design team has progressively abandoned the use of translucent colored plastics first used in the iMac G3. This began with the PowerBook, made with titanium, and was followed by the iBook's white polycarbonate structure and the flat-panel iMac.[81][82] The MacBook Pro, Apple's first laptop with an Intel microprocessor, announced in January 2006. At the Worldwide Developers Conference keynote address on June 6, 2005, Jobs announced that Apple would begin producing Intel-based Mac computers in 2006.[83] On January 10, 2006, the new MacBook Pro and iMac became the first Apple computers to use Intel's Core Duo CPU. By August 7, 2006, Apple made the transition to Intel chips for the entire Mac product line?over one year sooner than announced.[83] The Power Mac, iBook and PowerBook brands were retired during the transition; the Mac Pro, MacBook, and MacBook Pro became their respective successors.[84][85] On April 29, 2009, The Wall Street Journal reported that Apple was building its own team of engineers to design microchips.[86] Apple also introduced Boot Camp in 2006 to help users install Windows XP or Windows Vista on their Intel Macs alongside Mac OS X.[87] Apple's success during this period was evident in its stock price. Between early 2003 and 2006, the price of Apple's stock increased more than tenfold, from around $6 per share (split-adjusted) to over $80. In January 2006, Apple's market cap surpassed that of Dell.[88] Nine years prior, Dell's CEO Michael Dell said that if he ran Apple he would shut it down and give the money back to the shareholders.[89] Although Apple's market share in computers had grown, it remained far behind competitors using Microsoft Windows, accounting for about 8% of desktops and laptops in the US.[citation needed] 2007?10: Success with mobile devices Apple achieved widespread success with its iPhone, iPod Touch and iPad products, which introduced innovations in mobile phones, portable music players and personal computers respectively. In addition, the implementation of a store for the purchase of software applications represented a new business model. Touch screens had been invented and seen in mobile devices before, but Apple was the first to achieve mass market adoption of such a user interface that included particular pre-programmed touch gestures. Delivering his keynote speech at the Macworld Expo on January 9, 2007, Jobs announced that Apple Computer, Inc. would from that point on be known as Apple Inc., because computers were no longer the main focus of the company, which had shifted its emphasis to mobile electronic devices. The event also saw the announcement of the iPhone and the Apple TV.[90][91][92][93] The following day, Apple shares hit $97.80, an all-time high at that point. In May, Apple's share price passed the $100 mark.[94]";
        String[] words = input.split(" ");
        String[] months = {"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
        //System.out.println(input);
        //^[^abc]*
        regexFinder("((In )|(in )|(On )|(on )|(As of )|(as of ))?(((In )|(in ))|(January|February|March|April|May|June|July|August|September|October|November|December)) ?([0-9]{1,2})?,? ?[0-9]{1,4}",input);  
        //System.out.println("Partial:");
        
        
        for(int i=0;i<fullWords.size();i++)
            regexDates(2,"(((January|February|March|April|May|June|July|August|September|October|November|December) ?([0-9]{1,2})?,? ?[0-9]{1,4})|[0-9]{3,4})",fullWords.get(i));
        
        
        for(int i=0;i<step2Words.size();i++)
        {
            regexDates(3,"[0-9]{3,4}",step2Words.get(i));
        }
        
        
        arrofDates= new int[finalDates.size()];
        sortedDates = new int[finalDates.size()];
                
         List<String> newMeanings  = new LinkedList<>();
         List<String> newDates = new LinkedList<>();
        for(int i = 1; finalDates.size() > 1 && i < finalDates.size()-1;i++)
        {
            
            //double seperating = meanings.get(i).split(",").length-1 + meanings.get(i).split(";").length-1;
            //double listProbability = 0;
            //if(seperating != 0)
            //   listProbability = seperating*200/meanings.get(i).split(" ").length;
            //System.out.println(listProbability);
            /*
            if (listProbability > 50){
                //this is a list!!!!

                System.out.println(meanings.get(i).split(",")[0]);
            }else{
                //this isn't a list!!!!
                String newMeaning = input.substring(sentenceStarts.get(i)+1, sentenceEnds.get(i)).replace(input.substring(starts.get(i), ends.get(i)+1), "");
                meanings.set(i, newMeaning);
            }*/
            if (!(meanings.get(i).equals(meanings.get(i-1)) || meanings.get(i).length() > 150)){
                    newMeanings.add(removeDates(meanings.get(i), "((In )|(in )|(On )|(on )|(As of )|(as of )|(By ))?(((In )|(in ))|(January|February|March|April|May|June|July|August|September|October|November|December)) ?([0-9]{1,2})?,? ?[0-9]{1,4}"));
                    newDates.add(finalDates.get(i));
                    //break;
            }
        }
        
        
        /*    for(int i = 0; i < timeline.size(); i++){
            System.out.println(timeline.get(i));
            System.out.println(meanings.get(i));
        }*/
        int[] finalDatesArray = new int[newDates.size()];
        String[] finalMeaningsArray = new String[newDates.size()];
        for (int i = 0; i < newDates.size(); i++){
            finalDatesArray[i] = Integer.parseInt(newDates.get(i));
            finalMeaningsArray[i] = newMeanings.get(i);
        }
        for (int i = 0; i < finalDatesArray.length; i++){
            finalMeaningsArray[i] = removeWikipediasWierdStuff(removeWikipediasWierdStuff(finalMeaningsArray[i]));
            if(finalMeaningsArray[i].substring(0, 2).equals("  ")){
                finalMeaningsArray[i] = finalMeaningsArray[i].substring(0, 2).replace("  ", "") + finalMeaningsArray[i].substring(2) ;
            }
            if(finalMeaningsArray[i].substring(0, 1).equals(" ")){
                finalMeaningsArray[i] = finalMeaningsArray[i].substring(0, 1).replace(" ", "") + finalMeaningsArray[i].substring(1) ;
            }
            if(finalMeaningsArray[i].substring(0, 4).equals("And ")){
                finalMeaningsArray[i] = finalMeaningsArray[i].substring(0, 4).replace("And ", "") + finalMeaningsArray[i].substring(4);
            }
            if(finalMeaningsArray[i].substring(0, 5).equals("Also ")){
                finalMeaningsArray[i] = finalMeaningsArray[i].substring(0, 5).replace("Also ", "") + finalMeaningsArray[i].substring(5) ;
            }
            if(finalMeaningsArray[i].substring(0, 2).equals("  ")){
                finalMeaningsArray[i] = finalMeaningsArray[i].substring(0, 2).replace("  ", "") + finalMeaningsArray[i].substring(2) ;
            }
            if(finalMeaningsArray[i].substring(0, 1).equals(" ")){
                finalMeaningsArray[i] = finalMeaningsArray[i].substring(0, 1).replace(" ", "") + finalMeaningsArray[i].substring(1) ;
            }
            if(finalMeaningsArray[i].substring(0, 2).equals(", ")){
                finalMeaningsArray[i] = finalMeaningsArray[i].substring(0, 2).replace(", ", "") + finalMeaningsArray[i].substring(2) ;
            }
            finalMeaningsArray[i] = finalMeaningsArray[i].substring(0, 1).toUpperCase() + finalMeaningsArray[i].substring(1);
        }
        for (int i = 0; i < finalDatesArray.length; i++){
            System.out.print("Date: "+finalDatesArray[i]);
            System.out.println(" - "+finalMeaningsArray[i]);
        }
        
        
    }
    public static void regexDates(int step,String regex, String checker)
    {
          Pattern checkRegex = Pattern.compile(regex);
            Matcher matchRegex = checkRegex.matcher(checker);
            //System.out.println(matchRegex.find());
            while(matchRegex.find())
            {
                if(matchRegex.group().length() != 0)
                {
                    //System.out.println(matchRegex.group().trim());
                    if(step==2)
                    {
                        step2Words.add(matchRegex.group().trim());
                    }
                    else if(step==3)
                    {
                        finalDates.add(matchRegex.group().trim());
                    }
                }
           
                //System.out.println(findSentence(checker, matchRegex.start(), matchRegex.end()));
            }
          
    }
    public static void regexFinder(String regex, String checker)
    {
        //System.out.println("hello");
    Pattern checkRegex = Pattern.compile(regex);
    Matcher matchRegex = checkRegex.matcher(checker);
    //System.out.println(matchRegex.find());
    while(matchRegex.find())
    {
        if(matchRegex.group().length() != 0)
        {
            //System.out.println(matchRegex.group().trim());
            fullWords.add(matchRegex.group().trim());
            
        }
        
        //System.out.println(findSentence(checker, matchRegex.start(), matchRegex.end()));
        meanings.add(findSentence(checker, matchRegex.start(), matchRegex.end()));
    }
  
 }
 
 public static String findSentence(String checker, int start, int end){
     int i;/*
     List<Integer> possibleStarts = new LinkedList<>();
     List<Integer> possibleEnds = new LinkedList<>();*/
     starts.add(start);
     ends.add(end);
     for(i = start;  i > -1 && checker.charAt(i) != '.'; i--){
         if(checker.charAt(i) != ',' || checker.charAt(i) != ','){}
            //possibleStarts.add(i);
        }
     int sentenceStart = i;
     for(i = end; i < checker.length() && checker.charAt(i) != '.'; i++){
        if(checker.charAt(i) != ',' || checker.charAt(i) != ','){}
            //possibleEnds.add(i);
        }
     int sentenceEnd = i;
     sentenceStarts.add(sentenceStart);
     sentenceEnds.add(sentenceEnd);
     /*
     for (i = possibleStarts.size()-1; (sentenceEnd - sentenceStart > 150) && i > -1; i--){
         sentenceStart = possibleStarts.get(i);
         System.out.println(sentenceStart);
     }
     for (i = possibleEnds.size()-1; (sentenceEnd - sentenceStart > 150) && i > -1; i--){
         sentenceEnd = possibleEnds.get(i);
        System.out.println(sentenceEnd);
     }*/
     return checker.substring(sentenceStart+1, sentenceEnd)/*.replace(checker.substring(start, end+1), "")*/;
 }



    public static int[] sort(int[] data){
      int len = data.length;
      int key = 0;
      int i = 0;
      for(int j = 1;j<len;j++){
        key = data[j];
        i = j-1;
        while(i>=0 && data[i]>key){
          data[i+1] = data[i];
          i = i-1;
          data[i+1]=key;
        }
      }
      return data;
    }
    private static String removeDates(String checker, String regex){
        Pattern checkRegex = Pattern.compile(regex);
        Matcher matchRegex = checkRegex.matcher(checker);
        //System.out.println(matchRegex.find());
        while(matchRegex.find())
        {
            if(matchRegex.group().length() != 0)
            {
                //System.out.println(matchRegex.group().trim());
                fullWords.add(matchRegex.group().trim());
            
            }
        
            //System.out.println(findSentence(checker, matchRegex.start(), matchRegex.end()));
            return checker.replace(checker.substring(matchRegex.start(), matchRegex.end()), "");
        }
        return checker;
    }
    private static String removeWikipediasWierdStuff(String checker){
        String regex = "\\[.+?\\]";
        Pattern checkRegex = Pattern.compile(regex);
        Matcher matchRegex = checkRegex.matcher(checker);
        //System.out.println(matchRegex.find());
        while(matchRegex.find())
        {
            if(matchRegex.group().length() != 0)
            {
                //System.out.println(matchRegex.group().trim());
                fullWords.add(matchRegex.group().trim());
            
            }
        
            //System.out.println(findSentence(checker, matchRegex.start(), matchRegex.end()));
            return checker.replace(checker.substring(matchRegex.start(), matchRegex.end()), "");
        }
        return checker;
    }
private static String longestCommonSubstring(String S1, String S2)
{
    int Start = 0;
    int Max = 0;
    for (int i = 0; i < S1.length(); i++)
    {
        for (int j = 0; j < S2.length(); j++)
        {
            int x = 0;
            while (S1.charAt(i + x) == S2.charAt(j + x))
            {
                x++;
                if (((i + x) >= S1.length()) || ((j + x) >= S2.length())) break;
            }
            if (x > Max)
            {
                Max = x;
                Start = i;
            }
         }
    }
    return S1.substring(Start, (Start + Max));
}
}
