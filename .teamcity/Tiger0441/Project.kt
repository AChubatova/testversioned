package Tiger0441

import Tiger0441.buildTypes.*
import Tiger0441.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0441")
    name = "Tiger0441"

    vcsRoot(Tiger0441_cVCSroot)

    buildType(Tiger0441_Hi1)
    buildType(Tiger0441_Hi0)
    buildType(Tiger0441_Hi3)
    buildType(Tiger0441_Hi2)
})
