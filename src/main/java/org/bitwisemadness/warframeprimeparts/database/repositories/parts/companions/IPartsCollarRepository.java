package org.bitwisemadness.warframeprimeparts.database.repositories.parts.companions;

import org.bitwisemadness.warframeprimeparts.database.model.parts.companions.PartsCollar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPartsCollarRepository extends JpaRepository<PartsCollar, String> {
    List<PartsCollar> findByName(String name);

    Optional<PartsCollar> findByNameByUser(String name, String appUser);
}
