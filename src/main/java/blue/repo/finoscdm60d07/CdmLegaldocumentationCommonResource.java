package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HmhKdAbT2MRZUsE7sCtNxWo8eestifsJAK5KCzFN5bn2")
public class CdmLegaldocumentationCommonResource {
    public static String blueId() {
        return "HmhKdAbT2MRZUsE7sCtNxWo8eestifsJAK5KCzFN5bn2";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/common/Resource";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/common/Resource";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationcommonResource.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String comments;

    private ComRosettaModelFieldWithMetaString language;

    private CdmLegaldocumentationCommonResourceLength length;

    private ComRosettaModelFieldWithMetaString mimeType;

    private ComRosettaModelFieldWithMetaString resourceId;

    private CdmLegaldocumentationCommonFieldWithMetaResourceTypeEnum resourceType;

    private Double sizeInBytes;

    private String string;

    private String url;

    public String getComments() {
        return comments;
    }

    public CdmLegaldocumentationCommonResource comments(String comments) {
        this.comments = comments;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getLanguage() {
        return language;
    }

    public CdmLegaldocumentationCommonResource language(ComRosettaModelFieldWithMetaString language) {
        this.language = language;
        return this;
    }

    public CdmLegaldocumentationCommonResourceLength getLength() {
        return length;
    }

    public CdmLegaldocumentationCommonResource length(CdmLegaldocumentationCommonResourceLength length) {
        this.length = length;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getMimeType() {
        return mimeType;
    }

    public CdmLegaldocumentationCommonResource mimeType(ComRosettaModelFieldWithMetaString mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getResourceId() {
        return resourceId;
    }

    public CdmLegaldocumentationCommonResource resourceId(ComRosettaModelFieldWithMetaString resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public CdmLegaldocumentationCommonFieldWithMetaResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public CdmLegaldocumentationCommonResource resourceType(CdmLegaldocumentationCommonFieldWithMetaResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public Double getSizeInBytes() {
        return sizeInBytes;
    }

    public CdmLegaldocumentationCommonResource sizeInBytes(Double sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
        return this;
    }

    public String getString() {
        return string;
    }

    public CdmLegaldocumentationCommonResource string(String string) {
        this.string = string;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public CdmLegaldocumentationCommonResource url(String url) {
        this.url = url;
        return this;
    }

}
