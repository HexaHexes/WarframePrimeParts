package org.bitwisemadness.warframeprimeparts.database.repositories.parts.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.secondary.PartsThrowing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPartsThrowingRepository extends JpaRepository<PartsThrowing, String> {
    List<PartsThrowing> findByName(String name);

    Optional<PartsThrowing> findByNameByUser(String name, String appUser);
}
