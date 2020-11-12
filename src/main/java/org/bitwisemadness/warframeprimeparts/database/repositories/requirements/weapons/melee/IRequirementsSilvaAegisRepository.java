package org.bitwisemadness.warframeprimeparts.database.repositories.requirements.weapons.melee;

import org.bitwisemadness.warframeprimeparts.database.model.requirements.weapons.melee.RequirementsSilvaAegis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRequirementsSilvaAegisRepository extends JpaRepository<RequirementsSilvaAegis, String> {
}
