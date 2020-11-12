package org.bitwisemadness.warframeprimeparts.database.repositories.requirements.companions;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.companions.Collar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICollarRepository extends JpaRepository<Collar, String> {
}
