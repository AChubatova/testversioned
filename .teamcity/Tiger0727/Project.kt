package Tiger0727

import Tiger0727.buildTypes.*
import Tiger0727.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0727")
    name = "Tiger0727"

    vcsRoot(Tiger0727_cVCSroot)

    buildType(Tiger0727_Hi3)
    buildType(Tiger0727_Hi1)
    buildType(Tiger0727_Hi2)
    buildType(Tiger0727_Hi0)
})
