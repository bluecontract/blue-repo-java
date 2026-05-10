package blue.repository;

import blue.language.model.Node;

import java.util.Objects;

public final class RepositoryDefinition {
    private final String packageName;
    private final String name;
    private final String qualifiedName;
    private final String blueId;
    private final String resourcePath;
    private final String status;
    private final int repositoryVersionIndex;

    public RepositoryDefinition(String packageName,
                                String name,
                                String qualifiedName,
                                String blueId,
                                String resourcePath,
                                String status,
                                int repositoryVersionIndex) {
        this.packageName = require(packageName, "packageName");
        this.name = require(name, "name");
        this.qualifiedName = require(qualifiedName, "qualifiedName");
        this.blueId = require(blueId, "blueId");
        this.resourcePath = require(resourcePath, "resourcePath");
        this.status = status;
        this.repositoryVersionIndex = repositoryVersionIndex;
    }

    public String packageName() {
        return packageName;
    }

    public String name() {
        return name;
    }

    public String qualifiedName() {
        return qualifiedName;
    }

    public String blueId() {
        return blueId;
    }

    public String resourcePath() {
        return resourcePath;
    }

    public String status() {
        return status;
    }

    public int repositoryVersionIndex() {
        return repositoryVersionIndex;
    }

    public RepositoryType type() {
        return RepositoryType.of(packageName, name, qualifiedName, blueId, resourcePath);
    }

    public Node reference() {
        return new Node().blueId(blueId);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RepositoryDefinition)) {
            return false;
        }
        RepositoryDefinition that = (RepositoryDefinition) other;
        return repositoryVersionIndex == that.repositoryVersionIndex
                && Objects.equals(packageName, that.packageName)
                && Objects.equals(name, that.name)
                && Objects.equals(qualifiedName, that.qualifiedName)
                && Objects.equals(blueId, that.blueId)
                && Objects.equals(resourcePath, that.resourcePath)
                && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageName, name, qualifiedName, blueId, resourcePath, status, repositoryVersionIndex);
    }

    @Override
    public String toString() {
        return qualifiedName + " (" + blueId + ")";
    }

    private static String require(String value, String field) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException(field + " must not be empty");
        }
        return value;
    }
}
