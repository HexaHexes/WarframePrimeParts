package org.bitwisemadness.warframeprimeparts.database.repositories.parts.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary.PartsBallistica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPartsBallisticaRepository extends JpaRepository<PartsBallistica, String> {
    List<PartsBallistica> findByName(String name);

    Optional<PartsBallistica> findByNameByUser(String name, String appUser);
}
