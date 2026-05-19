package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("4BCnedTHThrwvaQmzaWFepy64MhBYnzC89LX4F39VFxR")
public class DateRelativeToPaymentDates {
    public static String blueId() {
        return "4BCnedTHThrwvaQmzaWFepy64MhBYnzC89LX4F39VFxR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DateRelativeToPaymentDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DateRelativeToPaymentDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/DateRelativeToPaymentDates.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private List<ReferenceWithMetaPaymentDates> paymentDatesReference;

    public String getNamespace() {
        return namespace;
    }

    public DateRelativeToPaymentDates namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<ReferenceWithMetaPaymentDates> getPaymentDatesReference() {
        return paymentDatesReference;
    }

    public DateRelativeToPaymentDates paymentDatesReference(List<ReferenceWithMetaPaymentDates> paymentDatesReference) {
        this.paymentDatesReference = paymentDatesReference;
        return this;
    }

}
