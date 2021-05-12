package Tiger0719

import Tiger0719.buildTypes.*
import Tiger0719.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0719")
    name = "Tiger0719"

    vcsRoot(Tiger0719_cVCSroot)

    buildType(Tiger0719_Hi0)
    buildType(Tiger0719_Hi1)
    buildType(Tiger0719_Hi2)
    buildType(Tiger0719_Hi3)
})
