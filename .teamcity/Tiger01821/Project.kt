package Tiger01821

import Tiger01821.buildTypes.*
import Tiger01821.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01821")
    name = "Tiger01821"

    vcsRoot(Tiger01821_cVCSroot)

    buildType(Tiger01821_Hi1)
    buildType(Tiger01821_Hi2)
    buildType(Tiger01821_Hi3)
    buildType(Tiger01821_Hi0)
})
