import java.util.ArrayList;

public class Main {

    public static void main (String a[]){

        QuestionService service =  new QuestionService();

        ArrayList<String> optionsList1 = new ArrayList<String>();
        optionsList1.add("Dynamic Host Configuration Protocol (DHCP)");
        optionsList1.add("Switch Flooding");
        optionsList1.add("Domain Name System query (DNS query)");
        optionsList1.add("Address Resolution Protocol (ARP)");

        Question question1 = new Question(  1, 
                                            "What is the network protocol used within a lan network to find a device's MAC address with its ip address",
                                            optionsList1,
                                            "Address Resolution Protocol (ARP)"                                            
                                            );

        ArrayList<String> optionsList2 = new ArrayList<String>();
        optionsList2.add("Network Address Translation (NAT)");
        optionsList2.add("DHCP Discovery");
        optionsList2.add("Static IP address");
        optionsList2.add("Link-Local IP address");

        Question question2 = new Question(  2,
                                            "What is the service used to transform private IP address into public IP address?",
                                            optionsList2,
                                            "Network Address Translation (NAT)"
                                            );

        service.addQuestionToList(question1);
        service.addQuestionToList(question2);

        service.displayQuestions();

    }

}