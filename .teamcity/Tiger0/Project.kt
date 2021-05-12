package Tiger0

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0")
    name = "Tiger0"

    subProject(Tiger04.Project)
    subProject(Tiger03.Project)
    subProject(Tiger02.Project)
    subProject(Tiger01.Project)
    subProject(Tiger08.Project)
    subProject(Tiger07.Project)
    subProject(Tiger06.Project)
    subProject(Tiger05.Project)
    subProject(Tiger09.Project)
    subProject(Tiger00.Project)
})
