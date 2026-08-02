package hexlet.code;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "gendiff", mixinStandardHelpOptions = true, version = "gendiff 1.0",
        description = "Compares two configuration files and shows a difference.")
public class App implements Runnable {

    @Option(names = {"-h", "--help"}, usageHelp = true, description = "Show this help message and exit.")
    private boolean help;

    @Option(names = {"-V", "--version"}, versionHelp = true, description = "Print version information and exit.")
    private boolean version;

    @Parameters(index = "0", description = "Path to first file", arity = "0..1")
    private String filePath1;

    @Parameters(index = "1", description = "Path to second file", arity = "0..1")
    private String filePath2;

    @Override
    public void run() {
        // Пока заглушка, позже здесь будет логика сравнения
        String result = Differ.generate(filePath1, filePath2);
        System.out.println(result);
    }

    public static void main(String[] args) {
        CommandLine commandLine = new CommandLine(new App());
        int exitCode = commandLine.execute(args);
        System.exit(exitCode);
    }
}

