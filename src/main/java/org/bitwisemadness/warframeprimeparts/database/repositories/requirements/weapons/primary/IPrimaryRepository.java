package org.bitwisemadness.warframeprimeparts.database.repositories.requirements.weapons.primary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.primary.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPrimaryRepository extends JpaRepository<Primary, String> {
}
