package org.bitwisemadness.warframeprimeparts.database.repositories.parts.companions;

import org.bitwisemadness.warframeprimeparts.database.model.parts.companions.PartsSentinel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPartsSentinelRepository extends JpaRepository<PartsSentinel, String> {
    List<PartsSentinel> findByName(String name);

    Optional<PartsSentinel> findByNameByUser(String name, String appUser);
}
