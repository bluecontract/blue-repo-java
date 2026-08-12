package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("GuFp1BJy74SUjnjVg7r3RwuRPXYUDKSUyEecdtsJ7QMX#0")
public class CdmLegaldocumentationMasterClause {
    public static String blueId() {
        return "GuFp1BJy74SUjnjVg7r3RwuRPXYUDKSUyEecdtsJ7QMX#0";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/master/Clause";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/master/Clause";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationmasterClause.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String identifier;

    private List<CdmLegaldocumentationMasterClause> subcomponents;

    private String terms;

    public String getIdentifier() {
        return identifier;
    }

    public CdmLegaldocumentationMasterClause identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    public List<CdmLegaldocumentationMasterClause> getSubcomponents() {
        return subcomponents;
    }

    public CdmLegaldocumentationMasterClause subcomponents(List<CdmLegaldocumentationMasterClause> subcomponents) {
        this.subcomponents = subcomponents;
        return this;
    }

    public String getTerms() {
        return terms;
    }

    public CdmLegaldocumentationMasterClause terms(String terms) {
        this.terms = terms;
        return this;
    }

}
