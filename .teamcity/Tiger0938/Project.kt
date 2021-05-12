package Tiger0938

import Tiger0938.buildTypes.*
import Tiger0938.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0938")
    name = "Tiger0938"

    vcsRoot(Tiger0938_cVCSroot)

    buildType(Tiger0938_Hi3)
    buildType(Tiger0938_Hi1)
    buildType(Tiger0938_Hi2)
    buildType(Tiger0938_Hi0)
})
