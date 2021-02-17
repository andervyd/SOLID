package by.andervyd.solid.srp.employee_architecture;

public class ReportFormatter {

    String formattedOutput;

    public ReportFormatter(Object object, FormatType formatType) {
        switch(formatType) {
            case XML:
                formattedOutput = convertObjectToXML(object);
                break;
            case CSV:
                formattedOutput = convertObjectToCSV(object);
                break;
        }
    }

    private String convertObjectToXML(Object object) {
        return "Converted to XML " + object.toString();
    }

    private String convertObjectToCSV(Object object) {
        return "Converted to CSV " + object.toString();
    }
}
