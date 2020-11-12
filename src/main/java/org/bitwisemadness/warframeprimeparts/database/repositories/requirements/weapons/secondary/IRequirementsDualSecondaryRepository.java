package org.bitwisemadness.warframeprimeparts.database.repositories.requirements.weapons.secondary;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.secondary.RequirementsDualSecondary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRequirementsDualSecondaryRepository extends JpaRepository<RequirementsDualSecondary, String> {
}
