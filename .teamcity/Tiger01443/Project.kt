package Tiger01443

import Tiger01443.buildTypes.*
import Tiger01443.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01443")
    name = "Tiger01443"

    vcsRoot(Tiger01443_cVCSroot)

    buildType(Tiger01443_Hi2)
    buildType(Tiger01443_Hi1)
    buildType(Tiger01443_Hi3)
    buildType(Tiger01443_Hi0)
})
