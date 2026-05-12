package blue.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class RepositoryTypeVersion {
    private final int repositoryVersionIndex;
    private final String typeBlueId;
    private final List<String> attributesAdded;
    private final boolean compatibleWithCurrent;

    public RepositoryTypeVersion(int repositoryVersionIndex,
                                 String typeBlueId,
                                 List<String> attributesAdded,
                                 boolean compatibleWithCurrent) {
        if (repositoryVersionIndex < 0) {
            throw new IllegalArgumentException("repositoryVersionIndex must not be negative");
        }
        this.repositoryVersionIndex = repositoryVersionIndex;
        this.typeBlueId = require(typeBlueId, "typeBlueId");
        this.attributesAdded = attributesAdded == null
                ? Collections.<String>emptyList()
                : Collections.unmodifiableList(new ArrayList<>(attributesAdded));
        this.compatibleWithCurrent = compatibleWithCurrent;
    }

    public int repositoryVersionIndex() {
        return repositoryVersionIndex;
    }

    public String typeBlueId() {
        return typeBlueId;
    }

    public List<String> attributesAdded() {
        return attributesAdded;
    }

    public boolean compatibleWithCurrent() {
        return compatibleWithCurrent;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RepositoryTypeVersion)) {
            return false;
        }
        RepositoryTypeVersion that = (RepositoryTypeVersion) other;
        return repositoryVersionIndex == that.repositoryVersionIndex
                && compatibleWithCurrent == that.compatibleWithCurrent
                && Objects.equals(typeBlueId, that.typeBlueId)
                && Objects.equals(attributesAdded, that.attributesAdded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryVersionIndex, typeBlueId, attributesAdded, compatibleWithCurrent);
    }

    @Override
    public String toString() {
        return repositoryVersionIndex + ":" + typeBlueId;
    }

    private static String require(String value, String field) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException(field + " must not be empty");
        }
        return value;
    }
}
