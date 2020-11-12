package org.bitwisemadness.warframeprimeparts.database.repositories.requirements.companions;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.companions.RequirementsCollar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRequirementsCollarRepository extends JpaRepository<RequirementsCollar, String> {
}
