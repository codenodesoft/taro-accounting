package org.soptorshi.domain;



import javax.persistence.*;

import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A JournalVoucherGenerator.
 */
@Entity
@Table(name = "journal_voucher_generator")
@Document(indexName = "journalvouchergenerator")
public class JournalVoucherGenerator implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "last_modified")
    private LocalDate lastModified;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getLastModified() {
        return lastModified;
    }

    public JournalVoucherGenerator lastModified(LocalDate lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    public void setLastModified(LocalDate lastModified) {
        this.lastModified = lastModified;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JournalVoucherGenerator journalVoucherGenerator = (JournalVoucherGenerator) o;
        if (journalVoucherGenerator.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), journalVoucherGenerator.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "JournalVoucherGenerator{" +
            "id=" + getId() +
            ", lastModified='" + getLastModified() + "'" +
            "}";
    }
}
