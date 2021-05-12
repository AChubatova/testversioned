package Tiger0424

import Tiger0424.buildTypes.*
import Tiger0424.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0424")
    name = "Tiger0424"

    vcsRoot(Tiger0424_cVCSroot)

    buildType(Tiger0424_Hi3)
    buildType(Tiger0424_Hi0)
    buildType(Tiger0424_Hi2)
    buildType(Tiger0424_Hi1)
})
