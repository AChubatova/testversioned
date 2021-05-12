package Tiger0945

import Tiger0945.buildTypes.*
import Tiger0945.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0945")
    name = "Tiger0945"

    vcsRoot(Tiger0945_cVCSroot)

    buildType(Tiger0945_Hi0)
    buildType(Tiger0945_Hi1)
    buildType(Tiger0945_Hi2)
    buildType(Tiger0945_Hi3)
})
