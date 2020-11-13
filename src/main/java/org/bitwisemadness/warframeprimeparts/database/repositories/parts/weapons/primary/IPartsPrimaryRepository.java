package org.bitwisemadness.warframeprimeparts.database.repositories.parts.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.parts.weapons.primary.PartsPrimary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPartsPrimaryRepository extends JpaRepository<PartsPrimary, String> {
    List<PartsPrimary> findByName(String name);

    Optional<PartsPrimary> findByNameByUser(String name, String appUser);
}
