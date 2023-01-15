package Lab08.ISPVio1;

public class MultiFunctionPrinter implements AbstractPrinter, AbstractFax, AbstractScanner {
    @Override
    public void Fax(Document d) {

    }

    @Override
    public Document Scan(String documentName) {
        Document d = new Document();
        d.documentName = documentName;
        return d;
    }

    @Override
    public void Print(Document d) {


    }
}
