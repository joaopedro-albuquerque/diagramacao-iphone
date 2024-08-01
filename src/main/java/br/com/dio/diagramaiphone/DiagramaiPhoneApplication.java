package br.com.dio.diagramaiphone;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import br.com.dio.diagramaiphone.services.IphoneService;
import java.util.Scanner;

public class DiagramaiPhoneApplication {
    private static final Logger logger = LogManager.getLogger(DiagramaiPhoneApplication.class);

    public static void main(String[] args) {
        IphoneService iphoneService = new IphoneService();
        Scanner scanner = new Scanner(System.in);
        String opcao;

        do {
            logger.info("Escolha uma ação:");
            logger.info("1. Ligar");
            logger.info("2. Atender");
            logger.info("3. Iniciar Correio de Voz");
            logger.info("4. Exibir Página");
            logger.info("5. Adicionar Nova Aba");
            logger.info("6. Atualizar Página");
            logger.info("7. Tocar Música");
            logger.info("8. Pausar Música");
            logger.info("9. Selecionar Música");
            logger.info("0. Sair");
            opcao = scanner.nextLine();

            String resultado = "";
            switch (opcao) {
                case "1":
                    logger.info("Digite o número para ligar: ");
                    String numero = scanner.nextLine();
                    resultado = iphoneService.ligar(numero);
                    break;
                case "2":
                    resultado = iphoneService.atender();
                    break;
                case "3":
                    resultado = iphoneService.iniciarCorreioVoz();
                    break;
                case "4":
                    logger.info("Digite a URL da página: ");
                    String url = scanner.nextLine();
                    resultado = iphoneService.exibirPagina(url);
                    break;
                case "5":
                    resultado = iphoneService.adicionarNovaAba();
                    break;
                case "6":
                    resultado = iphoneService.atualizarPagina();
                    break;
                case "7":
                    resultado = iphoneService.tocar();
                    break;
                case "8":
                    resultado = iphoneService.pausar();
                    break;
                case "9":
                    logger.info("Digite o nome da música: ");
                    String musica = scanner.nextLine();
                    resultado = iphoneService.selecionarMusica(musica);
                    break;
                case "0":
                    logger.info("Saindo...");
                    break;
                default:
                    resultado = "Opção inválida. Tente novamente.";
            }

            if (!opcao.equals("0")) {
                logger.info(resultado);
            }
        } while (!opcao.equals("0"));

        scanner.close();
    }
}
