public class MainTP5 {

    private static void runAll() {
        Demo01.run();
        Demo02.run();
        Demo03.run();
        Demo04.run();
        Demo05.run();
        Demo06.run();
        Demo07.run();
        Demo08.run();
        Demo09.run();
        Demo10.run();
        Demo11.run();
        Demo12.run();
        Demo13.run();
        Demo14.run();
    }

    private static void runOne(String code) {
        if (code == null) return;
        code = code.trim();
        if (code.isEmpty()) return;
        switch (code) {
            case "1": case "01": Demo01.run(); break;
            case "2": case "02": Demo02.run(); break;
            case "3": case "03": Demo03.run(); break;
            case "4": case "04": Demo04.run(); break;
            case "5": case "05": Demo05.run(); break;
            case "6": case "06": Demo06.run(); break;
            case "7": case "07": Demo07.run(); break;
            case "8": case "08": Demo08.run(); break;
            case "9": case "09": Demo09.run(); break;
            case "10": Demo10.run(); break;
            case "11": Demo11.run(); break;
            case "12": Demo12.run(); break;
            case "13": Demo13.run(); break;
            case "14": Demo14.run(); break;
            default:
                System.out.println("⚠ Número inválido: " + code);
        }
    }

    private static void runMany(String sel) {
        // Permite: "all", "*", "07", "1,3,5-7"
        if (sel == null) return;
        sel = sel.trim();
        if (sel.equalsIgnoreCase("all") || sel.equals("*")) {
            runAll(); return;
        }
        String[] parts = sel.split(",");
        for (String p : parts) {
            p = p.trim();
            if (p.isEmpty()) continue;
            if (p.contains("-")) {
                String[] range = p.split("-");
                if (range.length == 2) {
                    try {
                        int a = Integer.parseInt(range[0].trim());
                        int b = Integer.parseInt(range[1].trim());
                        if (a > b) { int tmp = a; a = b; b = tmp; }
                        for (int i = a; i <= b; i++) runOne(String.valueOf(i));
                    } catch (NumberFormatException e) {
                        System.out.println("⚠ Rango inválido: " + p);
                    }
                } else {
                    System.out.println("⚠ Rango inválido: " + p);
                }
            } else {
                runOne(p);
            }
        }
    }

    private static String promptInteractive() {
        System.out.println("=== TP5 – Relaciones UML (simple) ===");
        System.out.println("Elegí qué ejecutar:");
        System.out.println("  *  -> todas");
        System.out.println("  NN -> una (ej.: 07)");
        System.out.println("  lista separada por comas (ej.: 1,3,5-7)");
        System.out.print("Opción: ");
        try {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            String s = sc.nextLine();
            sc.close();
            return s;
        } catch (Exception e) {
            return "*";
        }
    }

    public static void main(String[] args) {
        // 1) Variable de sistema: -Drun=07  |  -Drun=all  | -Drun=1,3,5-7
        String sel = System.getProperty("run");

        // 2) Parámetro por línea de comandos (primer arg)
        if ((sel == null || sel.isBlank()) && args != null && args.length > 0) {
            sel = args[0];
        }

        // 3) Modo interactivo si no se pasó nada
        if (sel == null || sel.isBlank()) {
            sel = promptInteractive();
        }

        runMany(sel);
    }
}
