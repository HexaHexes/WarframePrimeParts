package org.bitwisemadness.warframeprimeparts.database.repositories.parts.frames;

import org.bitwisemadness.warframeprimeparts.database.model.parts.frames.PartsArchwing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPartsArchwingRepository extends JpaRepository<PartsArchwing, String> {
    List<PartsArchwing> findByName(String name);

    Optional<PartsArchwing> findByNameByUser(String name, String appUser);
}
