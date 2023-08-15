
public class ComputadorPedrinhoHeranca extends ServicoMensagemInstantanea{
    public static void main(String[] args) {
        System.out.println("MSN");
        MSNMessengerHeranca msn = new MSNMessengerHeranca();

        msn.enviarMensagem();

        msn.receberMensagem();

        System.out.println();
        System.out.println("Facebook");
        FacebookMessengerHeranca fcb = new FacebookMessengerHeranca();

        fcb.enviarMensagem();

        fcb.receberMensagem();

        System.out.println();
        System.out.println("Telegram");
        TelegramHeranca tlg = new TelegramHeranca();

        tlg.enviarMensagem();

        tlg.receberMensagem();
    }
}